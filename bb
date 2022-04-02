$ ls /usr/bin/python* /usr/bin/python /usr/bin/python2-config /usr/bin/python3m /usr/bin/python2 /usr/bin/python3 /usr/bin/python-config /usr/bin/python2.7 /usr/bin/python3.5 /usr/bin/python2.7-config...
>>>print('{0:<20}'.format('python')) >>>print('{0:>20}'.format('python')) >>>print('...python'...python  python  python
ln -s /usr/local/python3/bin/python3 /usr/bin/python3 ln -s /usr/local/python3/bin/pip3 /usr/bin/pip3 ln -s /usr/bin/pip3 /usr/bin/pip  # 
#include<stdio.h>
#include<string>
#include <iostream> 
bool test(std::string a, std::string b);
using namespace std;

int main(int argc, char* argv[])
{
    printf("请输入九个数（0-9）未知数默认为0,\n");
    char d[100];
    scanf_s("%c %c %c %c %c %c %c %c %c", &d[0],1, &d[1],1,&d[2],1 ,&d[3],1 ,&d[4],1 ,&d[5],1 ,&d[6],1 ,&d[7],1 ,&d[8],1);
    char x = d[0];
    char y = d[1];
    char z = d[2];
    //char x2='0';
    char x2 = d[3];
    char y2 = d[4];
    char z2 = d[5];
    char x3 = d[6];
    char y3 = d[7];
    char z3 = d[8];
    char strb[100] = { x,y,z,x2,y2,z2,x3,y3,z3 };
