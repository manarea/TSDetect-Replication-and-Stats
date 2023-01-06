"""
Delete all files from all folder that ends with scaffolding.java and replace it with .java
"""
import os
import shutil

def walk_all_folders():
    counter = 0
    for root, dirs, files in os.walk("."):
        for file in files:
            if file.endswith("scaffolding.java"):
                print("Removing: " + os.path.join(root, file))
                # os.remove(os.path.join(root, file))
            # change_public_class_line(os.path.join(root, file))
            
            if file.endswith("_ESTest.java"):
                counter += 1
                # Get the name of the file as a string
                fixed_root = root.replace(".", "").replace("\\", "/")
                fixed_name = file.replace("_ESTest.java", ".java")
                # print(fixed_root, fixed_name)
                found_file_path = look_for_same_named_file(fixed_root, fixed_name)
                copy_file(found_file_path, os.path.join(root, fixed_name))
    print(counter)


def look_for_same_named_file(current_folder, file_name):
    """
    Look for a folder with the same name as current_folder in the following path:
    C:/Users/maxim/OneDrive/Escritorio/aux2/arquivos/G01/SF110-20130704-src
    Then, look for a file with the same name as file_name in the folder found and copy it to the current_folder
    """
    counter = 0
    # for folder in os.listdir("C:/Users/maxim/OneDrive/Escritorio/aux2/arquivos/G01/SF110-20130704-src{0}".format(current_folder)):
    name_of_project = current_folder.split("/")[0]
    # print(name_of_project[0])
    # exit()
    for root, dirs, files in os.walk("C:/Users/maxim/OneDrive/Escritorio/Code/Functional-Evosuite-tests/subjects/{0}".format(name_of_project)):
        # First we need to find the folder
        for file in files:
            if file == file_name:
                print("Found: " + file)
                print(os.path.join(root, file).replace("\\", "/"))
                return os.path.join(root, file).replace("\\", "/")
                # copy_file(os.path.join(root, file), os.path.join(root, current_folder))
                exit()
        #     print(file == file_name)
        # print(counter)
        counter += 1
        # print(root)
    print("NOT FOUND: " + file_name)
        
    
def copy_file(file_path, current_folder):
    print("Copying: " + file_path + " to: " + current_folder)
    # Check if the file already exists
    if os.path.exists(current_folder):
        print("File already exists")
        return
    try:
        shutil.copy(file_path, current_folder)
    except Exception as e:
        print("Error: " + str(e))
    # exit()



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