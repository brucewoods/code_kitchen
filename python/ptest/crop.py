import cv2 
import uuid
import glob as glob
import sys
if len(sys.argv)<=1:
    print('need file name')
    sys.exit(1)
path=sys.argv[1]
def crop_img(img, scale=1.0,name='default'):
  
    
    center_x, center_y = img.shape[1] / 2, img.shape[0] / 2
    width_scaled, height_scaled = img.shape[1] , img.shape[0] * scale
    left_x, right_x = 0 , img.shape[1]
    top_y, bottom_y = 0, center_y + height_scaled / 2
    img_cropped = img[int(top_y):int(bottom_y), int(left_x):int(right_x)]
    img_remove=img[int(bottom_y):int(img.shape[0]), int(left_x):int(right_x)]

    mser = cv2.MSER_create()
    vis=img_remove.copy()
    gray=cv2.cvtColor(img_remove,cv2.COLOR_BGRA2GRAY)
    regions,_=mser.detectRegions(gray)
    hulls = [cv2.convexHull(p.reshape(-1, 1, 2)) for p in regions]

    cv2.polylines(vis, hulls, 1, (0, 255, 0))

    im_bw= cv2.cvtColor(vis, cv2.COLOR_RGB2GRAY)
    
    area= cv2.minMaxLoc(im_bw)
    hit=area[3][0]
    width=img.shape[1]
    f=hit/width
    print('image rate %s' % f)
    # if f>0.700:
    #    print('if')
    #    cv2.imwrite('data/crop4/%s' % name ,img_cropped)
    # else:
    cv2.imwrite( name ,img_cropped)
    #    print('else')

imgs = glob.glob(path)
#imgs = glob.glob('E:\\\\files\\\\rootpic\\\\*')
print(len(imgs))
for m in imgs:
 img=cv2.imread(m)

 crop_img(img, 0.95,m)


 print('copying %s ' % m) 
 #print('image width %s ' % img_cropped.shape[1]) 
 
 #cv2.imwrite('data43/%s' % name ,img_cropped)

