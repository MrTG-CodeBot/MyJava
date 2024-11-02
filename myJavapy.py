import os
import subprocess

class MyJavaPy:
    def __init__(self):
        self.repo_url = "https://github.com/MrTG-CodeBot/myJava_py.git"

    def check_dirpath(self, dirpath):
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

            for slash in file_root:
                rm_slash = slash.replace('\\\\', '\\')
                print(f"Files are saved in this dir: {rm_slash}")

        except Exception as e:
            print(f"An error occurred: {e}")

    def run(self):
        while True:
            path = print("Please input the full path to the folder for save the Java files and classes (eg: C:\\abc\\Downloads\\java_prgm).")
            path = input("Enter path: ")
            self.check_dirpath(path)
            if os.path.exists(path):
                break

if __name__ == "__main__":
    runner = MyJavaPy()
    runner.run()
