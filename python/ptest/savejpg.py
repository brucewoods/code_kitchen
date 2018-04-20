import cv2
import glob
import os
qdir='E:\\files\\AA\\companyproduct\\**\\**\\*'
imgs=glob.iglob(qdir,recursive=True)
for m in imgs:

  if  m.endswith(".jpg") or m.endswith(".png") or m.endswith(".JPG"):
    image=cv2.imread(m)
    s=m.replace('.png','.jpg')
    s=s.replace('.jpeg','.jpg')

    cv2.imwrite(s,image)
    if m.endswith('.png'):
        os.remove(m)