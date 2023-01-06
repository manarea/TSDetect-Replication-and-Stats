package com.hf.sfm.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hf.sfm.crypt.Base64;

public class DaoFactory {

	private static Log log = LogFactory.getLog(DaoFactory.class);
	public Session session = null;
	public CallableStatement ps = null;
	public ResultSet rs = null;
	public Connection conn = null;
	private Transaction tx = null;
	
	public DaoFactory() {
	}
	
	public void currentSession(){
		this.session = HibernateSessionFactory.currentSession();
	}
	
	
	public void closeSession(){
		HibernateSessionFactory.closeSession();
	}
	
	
	public void commit() {
		this.tx.commit();
		closeAll();
	}

	
	public void beginTransaction() {
		currentSession();
		tx = this.session.beginTransaction();
	}
	
	
	public void rollback(){
		tx.rollback();
	}
	
	public String encrypt(String str){
		return Base64.byteArrayToBase64(str.getBytes());
	}
	
	
	public String decrypt(String s){
		return new String(Base64.base64ToByteArray(s));
	}
	
	
	 
	public void save(Object obj) {
		session.save(obj);
	}

	
	 
	public void update(Object obj) {
		session.update(obj);
	}
	
	
	public void closeAll(){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(ps!=null){
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(session!=null){
			session.close();
		}
	}
}