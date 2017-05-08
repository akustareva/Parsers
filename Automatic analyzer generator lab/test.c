#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>

int i, i1, i2;
char c;
double d;
int main() {
	scanf("%d", &i);
	scanf("%f\n", &d);
	scanf("%d %c", &i, &c);
	scanf("%c %f\n", &c, &d);
	printf("%d", i);
	printf("%c\n", c);
	printf("%d %f", i, d);
	printf("%c %f\n", c, d);
	i = 5;
	i1 = i;
	i2 = 876 + i * i1 + i1 / 6;
	return 0;
}
