"""
Delete all files from all folder that ends with scaffolding.java and replace it with .java
"""
import os

def walk_all_folders():
    for root, dirs, files in os.walk("."):
        for file in files:
            if file.endswith("scaffolding.java"):
                print("Removing: " + os.path.join(root, file))
                # os.remove(os.path.join(root, file))
            change_public_class_line(os.path.join(root, file))

def change_public_class_line(file_path):
    "Edit the file and change the public class line"
    with open(file_path, "r", encoding="utf-8") as file:
        lines = file.readlines()
        for line in lines:
            if line.startswith("public class"):
                
                print("Changing: " + line + " to: " + file_path)
                splited_line = line.replace("{", "").replace("}", "").split(" ")
                new_line = "public class " + splited_line[2] + " { \n"
                lines[lines.index(line)] = new_line
                break
            
        with open(file_path, "w") as file:
            file.writelines(lines)

if "__main__" == __name__:
    walk_all_folders()