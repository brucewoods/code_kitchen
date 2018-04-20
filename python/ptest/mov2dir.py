import glob
import shutil
qdir='E:\\files\\AA\\companyproduct\\**\\**\\*'
sdir='./data/crop3/*'
files=glob.glob(sdir)

    
for filename in glob.iglob(qdir,recursive=True):
    if not filename.endswith('images'):
       fn=filename.split('\\')[-1]
       matching=[s for s in files if fn in s ]
       for m in matching:
           print('filename: %s  copied to filename:%s'%(filename,m))
           shutil.copy2(m,filename)       