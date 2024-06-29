#include<stdio.h>

int main()
{
	int x = 8;
	int y = 5;
	int ans1 = ++x + x++;
	int ans2 = --y + y--;
	printf("%d\n",ans1);
	printf("%d\n",ans2);
	printf("%d\n",x);
	printf("%d\n",y);
	return(0);	

}