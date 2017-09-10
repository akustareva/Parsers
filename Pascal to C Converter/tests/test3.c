#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>

int a1, a2, a3;
bool b1, b2, b3;
char c1, c2;
double d1, d2, tmp;
int main() {
	scanf("%d %d", &a1, &a2);
	scanf("%d\n", &a3);
	scanf("%c", &c1);
	scanf("\n");
	scanf("%c\n", &c2);
	d1 = a1 * 5674 / 674 - a2 / 56 + a3 / 674 - 78 * 90;
	d2 = d1 - a1 + a2;
	tmp = d2;
	printf("%d %d %d", a1, a2, a3);
	printf("\n");
	printf("%d %d %d\n", b1, b2, b3);
	printf("%f", d1);
	return 0;
}
