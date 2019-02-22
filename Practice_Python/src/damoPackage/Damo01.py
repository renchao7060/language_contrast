# coding=gbk
'''
Created on 2019年2月17日

@author: Study
'''
for i in range(1,10):
    for j in range(1,i+1):
        print('%d*%d=%d\t'%(j,i,j*i),end='')
    print('\n',end='')
    