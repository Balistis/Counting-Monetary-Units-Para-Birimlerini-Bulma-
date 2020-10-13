#include<stdio.h>
#include<conio.h>
/*AMAC: bilgileri girilen 4 ogrencinin ortalama ve ustune kalanlarinin hesabi.*/
	
struct ogrenci {
   char ad[20];
   int puan;
};

int main()
{

	int i,toplam=0,ortalama=0;
	struct ogrenci o[4];
	
	for(i=0;i<4;i++)
	{
	printf("%d. ogrencinin adi>\n",i+1);
	scanf("%s",&o[i].ad);
	
	printf("%d. ogrencinin puani>\n",i+1);
	scanf("%d",&o[i].puan);
	
	toplam += o[i].puan;
	}
	 
	ortalama = toplam / 4;
	printf("Ortalama %d\n\n",ortalama);
	
	for(i=0;i<4;i++)
	{
		if (o[i].puan >= ortalama)
			printf("%s adli ogrenci ortalama uzerinde.\n",o[i].ad);
			
		else
			printf("%s adli ogrenci ortalama altinda.\n",o[i].ad);
	}
	return 0;
}
