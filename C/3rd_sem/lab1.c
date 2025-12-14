#include<stdio.h>
#include<stdlib.h>

struct Day{
char *name;
int date;
char *activity;
};

void create(struct Day* day){
  day->name=(char*)malloc(sizeof(char)*20);
  day->activity=(char*)malloc(sizeof(char)*100);
  print("Enter the date:");
  scanf("%d",&day->date);
  printf("\nEnter the day name:");
  scanf("%s",day->name);
  printf("\nEnter the activity:");
  scanf("%s",day->activity);
}

void read(struct Day* calendar,int size){
  for(int i =0;i<size;i++){
      printf("\n\nEnter the day %d details\n",i+1);
      create(&calendar[i]);
  }
}

void dispaly(struct Day* calendar,int size){
  printf("\n\nWeek's Activity details\n");
for(int i=0;i<size;i++){
  printf("\nDay %d\n",i+1);
  printf("Date:%d",calendar[i].date);
  printf("\nDay:%s",calendar[i].name);
  printf("\nActivity:%s",calendar[i].activity);
}
}

void freeMemory(struct Day* calendar,int size){
for (int i=0,i<size;i++){
free(calendar[i].name);
free(calendar[i].activity);
}
}

int main(){
  int size;
printf("enter the number of days:\n");
scanf("%d",&size);
struct Day* calendar=(struct Day*)malloc(sizeof(struct Day)*size);
if(calendar==NULL){
printf("\n Mememory allocation failled, exiting the program");
return 1;}
read(calendar,size);
display(calendar,size);
freeMemory(calendar,size);
free(calendar);
return 0;
}
  

