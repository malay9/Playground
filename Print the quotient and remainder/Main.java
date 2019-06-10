#include<stdio.h>
int main()
{
  int a=365,b=4,c;
  c=a%b;
  int d=a/b;
  printf("Quotient: %d\n",d);
  printf("Remainder: %d",c);
  return 0;
}