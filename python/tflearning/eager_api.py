import tensorflow as tf
import numpy as np
import tensorflow.contrib.eager as te

print("setting eager mode....")
te.enable_eager_execution()

print("define constant tensors")

a=tf.constant(2)

print("a=%i" % a)

b=tf.constant(3)

print ("b=%i" % b)

c=a+b

print("a+b=%i" % c)

d=a*b

print("a*b=%i" % d)
a=tf.constant([[3.,4.],[5.,6.]],dtype=tf.float32)
print("tensor a=%s" % a)
b=np.array([[3.,0.],[5.,1.]],dtype=np.float32)
print("numpy b=%s" %b)

c=a+b
print(" addition a+b=%s" % c)
d=tf.matmul(a,b)
print("muli a*b=%s" % d )

print("start iterate through a tensor")
for i in range(a.shape[0]):
    for j in range(a.shape[1]):
          print(a[i][j])


