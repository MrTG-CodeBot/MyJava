"""
Copyright (c) 2024 MrTG-CodeBot

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
"""

import os
import subprocess

class MyJavaPy:
    """
    This class helps clone a Java repository, remove the .gitignore file,
    compile specific Java files, and print their locations.
    """

    def __init__(self):
        """
        Initializes the class with the default Git repository URL.
        """
        self.repo_url = "https://github.com/MrTG-CodeBot/myJava_py.git"

    def check_dirpath(self, dirpath):
        """
        Checks if the provided directory exists and creates it if not.
        Also clones the Git repository to the specified directory and removes the .gitignore file.

        Args:
            dirpath (str): The full path to the directory for saving Java files.

        Returns:
            None
        """

        try:
            if not os.path.exists(dirpath):
                os.makedirs(dirpath)
                print(f"{dirpath} created")

            subprocess.run(["git", "clone", self.repo_url, dirpath])

            df_path = os.path.join(dirpath, ".gitignore")
            try:
                os.remove(df_path)
                print(f"File '{df_path}' deleted successfully.")
            except OSError as error:
                print(f"Error: {error.strerror}")

            file_root = []
            for root, _, filenames in os.walk(dirpath):
                for filename in filenames:
                    if filename.endswith(".java") and not filename.startswith("sample"):
                        if filename in ["io.java", "math.java"]:
                            file_root.append(os.path.join(root, filename))

            for file in file_root:
                subprocess.run(["javac", file])

            for file in file_root:
                cleaned_path = file.replace("\\\\", "\\")  
                print(f"Files are saved in this directory: {cleaned_path}")

        except Exception as e:
            print(f"An error occurred: {e}")

    def run(self):
        """
        Prompts the user for the directory path and calls the check_dirpath function.

        Returns:
            None
        """

        while True:
            print("Please input the full path to make the new folder for save the Java files and classes (eg: C:\\abc\\Downloads\\new_folder_name).")
            path = input("Enter path: ")
            self.check_dirpath(path)
            break

if __name__ == "__main__":
    runner = MyJavaPy()
    runner.run()
