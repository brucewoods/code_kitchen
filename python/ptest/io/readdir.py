import os

path="./io"

classes=os.walk(path).__next__()[1]
print(len(classes))
for c in classes:
    print(c)