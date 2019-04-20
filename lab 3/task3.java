//task3: recognizing alphabet as either VOWEL or CONSONANT.
class Alphabet
{
   public static void main(String args[])
   {
   char a=args[0].charAt(0);
   switch(a){
                case 'a':   System.out.println("vowel.");
	break;
	case 'e':   System.out.println("vowel.");
	break;
	case 'i':   System.out.println("vowel.");
	break;
	case 'o':   System.out.println("vowel.");
	break;
	case 'u':   System.out.println("vowel.");
	break;
	default:    System.out.println("consonant.");
	break;	
              }
   }
}

   