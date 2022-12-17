int maxPower(char * s){
    int len=strlen(s);
    int count=0,max=0,prev=' ';
    for(int i=0;i<len;i++)
    {
        if(s[i]==prev)
        {
            count++;
        }
        else{
            count=1;
            prev=s[i];
        }
        max=(max<count)?count:max;
    }
    return max;
}


