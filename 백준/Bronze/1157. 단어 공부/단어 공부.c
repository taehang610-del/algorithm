#include <stdio.h>
#include <string.h>

int main(void)
{
	char array[1000001];
	scanf("%s", array);
	int alpabetNumber[26] = { 0 };
	int ascNumber = 0;
	int max = 0;
	int equal = 0;
	int maxindex = 0;

	for (int i = 0; array[i] != '\0'; i++)
	{
		ascNumber = (int)array[i];
		if (ascNumber >= 97 && ascNumber <= 122)
		{
			alpabetNumber[ascNumber - 97] += 1;
		}
		else if (ascNumber >= 65 && ascNumber <= 90)
		{
			alpabetNumber[ascNumber - 65] += 1;
		}
	}

	for (int j = 0; j < 26; j++)
	{
		if (alpabetNumber[j] > max)
		{
			max = alpabetNumber[j];
			maxindex = j;
		}
	}

	for (int k = 0; k < 26; k++)
	{
		if (max == alpabetNumber[k])
		{
			equal++;
		}
	}

	if (equal > 1)
	{
		printf("?\n");
	}
	else
	{
		printf("%c", maxindex + 65);
	}

	return 0;
}