import java.util.*;
public class ImGreedy {
    static class Item{
        int price,weight;
        double ratio;
        public Item(int p,int w){
            price=p;
            weight=w;
            ratio=(double)p/w;
        }
    }
    public static void fractionalKnpsack(List<Item> il,int capacity){
        double ans=0;
        il.sort((i1,i2)->Double.compare(i2.ratio, i1.ratio));
        for(int i=0;i<il.size()&&capacity>0;i++){
            Item t=il.get(i);
            if(t.weight<=capacity)ans+=t.price;
            else ans+=t.ratio*capacity;
            capacity-=t.weight;
        }
        System.out.println("total profit"+ans);
    }
    static class Meeting{
        int start,end,id;
        public Meeting(int s,int e,int i){
            start=s;
            end=e;
            id=i;
        }
    }
    public static void maxMeetings(List<Meeting> l){
        l.sort((l1,l2)->Integer.compare(l1.end,l2.end));
        List<Integer> res=new ArrayList<>();
        res.add(l.get(0).id);
        Meeting onGoing=l.get(0);
        for(int i=0;i<l.size();i++){
            Meeting curr=l.get(i);
            if(curr.start>onGoing.end)res.add(curr.id);
        }
        System.out.println(l);
        System.out.println(res);
    }
    public static void surviveIsland(int s,int n,int m){
        //you need to survive s days on each day you need m food you can produce n food/day
        int ans=0,totFoodRequired=s*m;
        if(m>n||7*m>6*n)ans=-1;
        else ans=(int)Math.ceil((double)totFoodRequired/n);
        System.out.println(ans);
    }
    public static void largestPalindrome(String num){
        int freq[]=new int[10];
        for(char x:num.toCharArray()){
            freq[x-'0']++;
        }
        if(!isValid(freq)){
            System.out.println("can't make valid palindrome!");
            return;
        }
        StringBuilder ans=new StringBuilder();
        //first-half
        for(int i=9;i>=0;i--){
            while(freq[i]>1){
                ans.append(i);
                freq[i]-=2;
            }
        }
        String res=ans.toString();
        //middle(if any)
        for(int i=9;i>=0;i--){
            while(freq[i]==1){
                res+=i;
                freq[i]--;
                break;
            }
        }//last part
        res+=(ans.reverse().toString());
        System.out.println(res);
    }
    public static boolean isValid(int freq[]){
        boolean odds=false;
        for(int x:freq){
            if(x%2==1){
                if(odds)return false;
                odds=true;
            }
        }
        return true;
    }
    public static void totalCost(int m,int n,List<Integer> x,List<Integer> y){
        x.sort(Collections.reverseOrder());
        y.sort(Collections.reverseOrder());
        int ans=0,verticalPeices=1,horizontalPeices=1;
        int i=0,j=0;
        while(i<m-1&&j<n-1){
            if(x.get(i)>y.get(j)){
                ans+=x.get(i++)*horizontalPeices;
                verticalPeices++;    
            }else{
                ans+=y.get(j++)*verticalPeices;
                horizontalPeices++;
            }
        }
        while(i<m-1)ans+=x.get(i++)*horizontalPeices;
        while(j<n-1)ans+=y.get(j++)*verticalPeices;
        System.out.println(ans);
    } 
    static class Interval{
        int start,end;
        public Interval(int s,int e){
            start=s;
            end=e;
        }
        public String toString(){
            return start+"-"+end;
        }
    }
    public static void removeInterval(List<Interval> l){
        l.sort((l1,l2)->Integer.compare(l1.start, l2.start));
        int ans=0;
        int prevEndTime=l.get(0).end;
        for(int i=0;i<l.size();i++){
            Interval curr=l.get(i);
            if(curr.start<prevEndTime){
                prevEndTime=Math.min(curr.end,prevEndTime);
                ans++;
            }else prevEndTime=curr.end;
        }
        System.out.println(ans);
    }
    public static void smallest(int s,int d){
        if(s==0||s>d*9){
            System.out.println("not possible!");
            return;
        }
        s-=1;
        int arr[]=new int[d];
        for(int i=arr.length-1;i>=1;i++){
            if(s>9){
                arr[i]=9;
                s-=9;
            }else{
                arr[i]=s;
                s=0;
                break;
            }    
        }
        arr[0]=s+1;
        for(int x:arr){
            System.out.print(x);
        }
    }
    public static void main(String[] args) {
       smallest(9,2);
    }
}
