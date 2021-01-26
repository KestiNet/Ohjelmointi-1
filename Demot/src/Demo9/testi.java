public static void main(String[]args)
{
    ArrayList<String> words = new ArrayList<String>();
    words.add("small");
    words.add("medium");
    words.add("gigantic");

    int max = 0;
    int index = 0;

    //loop the list
    for(int i = 0; i < words.size(); i++)
    {
        //if the length of the word is greater than the max length so far
        if(words.get(i).length() > max)
        {
            //update max to the length of the string
            max = words.get(i).length();
            //update the location of the largest string
            index = i;
        }
    }

    words.remove(index);

    for(int i = 0; i < words.size(); i++)
    {
        System.out.println(words.get(i));
    }
}