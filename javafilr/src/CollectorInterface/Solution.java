package CollectorInterface;


import java.util.*;

public class Solution {
    class Results{
        public String set_name;
        public String[] selected_Cards;
        Results(String set_name,String[] selected_Cards){
            this.set_name=set_name;
            this.selected_Cards=selected_Cards;
        }
    }
    public Results solution (String[] cards){
        Map<String, Set<String>> cards_suit=new HashMap<>();

        Map<String, Set<String>> suit_card=new HashMap<>();
        suit_card.put("D",new HashSet<>());
        suit_card.put("H",new HashSet<>());
        suit_card.put("C",new HashSet<>());
        suit_card.put("S",new HashSet<>());
        String[] present=new String[13];

        for (int i=0; i<cards.length; i++){
            String p1=cards[i].substring(0,cards[i].length()-1);
            String p2=cards[i].substring(cards[i].length()-1);
            cards_suit.putIfAbsent(p1,new HashSet<>());
            cards_suit.get(p1).add(p2);
            suit_card.putIfAbsent(p2,new HashSet<>());
            suit_card.get(p2).add(p1);
            int num=card_RankMap(p1);
            present[num]=p2;
        }
        int count=4;
        String[] con=new String[5];
        for(int i=12; i>=0; i--){
            if(present[i]!=null){
                con[count]=map_findCard(i)+present[i];
                count--;
            }
            else{
                count=4;
            }
            if(count==-1){
                break;
            }
        }

        String[] pair=new String[5];
        for(String key:cards_suit.keySet()){
            Set<String> set=cards_suit.get(key);
            int size=set.size();
            int rank=card_RankMap(key);
            if(pair[size]==null || card_RankMap(pair[size])<rank ){
                pair[size]=key;
            }
        }
        if(pair[3]!=null && pair[2]!=null){
            String c=pair[3];
            Set<String> set=cards_suit.get(c);
            String[] array = new String[5];
            int i=0;
            for(String str:set){
                array[i++]=c+str;
            }

            c=pair[2];
            set=cards_suit.get(c);
            for(String str:set){
                array[i++]=c+str;
            }
            Results res=new Results("a triple and a pair",array);
            return res;

        }
        else if(suit_card.get("D").size()==5||suit_card.get("H").size()==5||suit_card.get("C").size()==5||suit_card.get("S").size()==5){
            if(suit_card.get("S").size()==5){
                String s="S";
                Set<String> set=suit_card.get(s);
                String[] array = new String[5];
                int i=0;
                for(String str:set){
                    array[i++]=str+s;
                }
                Results res=new Results("suit",array);
                return res;
            }
            else if(suit_card.get("H").size()==5){
                String s="H";
                Set<String> set=suit_card.get(s);
                String[] array = new String[5];
                int i=0;
                for(String str:set){
                    array[i++]=str+s;
                }

                Results res=new Results("suit",array);
                return res;
            }
            else if(suit_card.get("D").size()==5){
                String s="D";
                Set<String> set=suit_card.get(s);
                String[] array = new String[5];
                int i=0;
                for(String str:set){
                    array[i++]=str+s;
                }

                Results res=new Results("suit",array);
                return res;
            }
            else {
                String s="C";
                Set<String> set=suit_card.get(s);
                String[] array = new String[5];
                int i=0;
                for(String str:set){
                    array[i++]=str+s;
                }
                Results res=new Results("suit",array);
                return res;
            }

        }
        else if(count==-1){
            String array = "five in a row";
            Results res=new Results(array,con);
            return res;

        }
        else if(pair[3]!=null){
            String c=pair[3];
            Set<String> set=cards_suit.get(c);
            String[] array = new String[3];
            int i=0;
            for(String str:set){
                array[i++]=c+str;
            }
            Results res=new Results("triple",array);
            return res;
        }
        else if(pair[2]!=null){
            String c=pair[2];
            Set<String> set=cards_suit.get(c);
            String[] array = new String[2];
            int i=0;
            for(String str:set){
                array[i++]=c+str;
            }
            Results res=new Results("pair",array);
            return res;
        }
        else{
            String c=pair[1];
            Set<String> set=cards_suit.get(c);
            String[] array = new String[1];
            int i=0;
            for(String str:set){
                array[i++]=c+str;
            }
            Results res=new Results("single card",array);
            return res;
        }

    }

    private String map_findCard(int i) {
        Map<Integer,String> cardsSuit=new HashMap<>();
        cardsSuit.put(0,"2");
        cardsSuit.put(1,"3");
        cardsSuit.put(2,"4");
        cardsSuit.put(3,"5");
        cardsSuit.put(4,"6");
        cardsSuit.put(5,"7");
        cardsSuit.put(6,"8");
        cardsSuit.put(7,"9");
        cardsSuit.put(8,"10");
        cardsSuit.put(9,"J");
        cardsSuit.put(10,"Q");
        cardsSuit.put(11,"K");
        cardsSuit.put(12,"A");
        return  cardsSuit.get(i);
    }

    private int card_RankMap(String str) {
        Map<String,Integer> cardsSuit=new HashMap<>();
        cardsSuit.put("2",0);
        cardsSuit.put("3",1);
        cardsSuit.put("4",2);
        cardsSuit.put("5",3);
        cardsSuit.put("6",4);
        cardsSuit.put("7",5);
        cardsSuit.put("8",6);
        cardsSuit.put("9",7);
        cardsSuit.put("10",8);
        cardsSuit.put("J",9);
        cardsSuit.put("Q",10);
        cardsSuit.put("K",11);
        cardsSuit.put("A",12);
        return  cardsSuit.get(str);
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        String[] str={"2H","4H","7C","9D","10D","KS"};
        Results res=s.solution(str);
        System.out.println(res);

    }
}
