import cv2
import numpy as np

#Create MSER object
mser = cv2.MSER_create()

#Your image path i-e receipt path
img = cv2.imread('./data/234a.jpg')

#Convert to gray scale
gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
#black=cv2.cvtColor(gray, cv2.COLOR_bla)
vis = img.copy()

#detect regions in gray scale image
regions, _ = mser.detectRegions(gray)

hulls = [cv2.convexHull(p.reshape(-1, 1, 2)) for p in regions]

cv2.polylines(vis, hulls, 1, (0, 255, 0))
im_bw= cv2.cvtColor(vis, cv2.COLOR_RGB2GRAY)
_, contours, _ = cv2.findContours(im_bw, cv2.RETR_LIST, cv2.CHAIN_APPROX_SIMPLE)
area= cv2.minMaxLoc(im_bw)
hit=area[3][0]
width=img.shape[1]
f=hit/width
#perimeter = cv2.arcLength(contours,True)
cv2.imshow('img2 loc %s' % (f) , im_bw)
cv2.imshow('img', vis)

print(len(contours))
cv2.waitKey(0)

mask = np.zeros((img.shape[0], img.shape[1], 1), dtype=np.uint8)

for contour in hulls:

    cv2.drawContours(mask, [contour], -1, (255, 255, 255), -1)

#this is used to find only text regions, remaining are ignored
text_only = cv2.bitwise_and(img, img, mask=mask)

cv2.imshow("text only", text_only)

cv2.waitKey(0)