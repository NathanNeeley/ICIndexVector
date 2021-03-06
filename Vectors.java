import java.util.Scanner;

public class Vectors {
	

    static void pitchClassOption(int[] array, int pitchClass, String numberName){
        Scanner input = new Scanner(System.in);


//Pitch-Class Input with Loop
        for (int i = 0; i < array.length; i++){
            do {
                System.out.print("Pitch-Class: ");
                numberName = input.next();
			
			
//Convert Pitch-Class String
                switch (numberName){
			
                    case "0":
                        pitchClass = 0;
                        break;
                    case "1":
                        pitchClass = 1;
                        break;
                    case "2":
                        pitchClass = 2;
                        break;
                    case "3":
                        pitchClass = 3;
                        break;
                    case "4":
                        pitchClass = 4;
                        break;
                    case "5":
                        pitchClass = 5;
                        break;
                    case "6":
                        pitchClass = 6;
                        break;
                    case "7":
                        pitchClass = 7;
                        break;
                    case "8":
                        pitchClass = 8;
                        break;
                    case "9":
                        pitchClass = 9;
                        break;
                    case "10":
                        pitchClass = 10;
                        break;
                    case "11":
                        pitchClass = 11;
                        break;
                    default:
                        pitchClass = -1;
                        break;
                }
                array[i] = pitchClass;
                if (pitchClass < 0 || pitchClass > 11)
                    System.out.print("Invalid Input. ");
            } while (pitchClass < 0 || pitchClass > 11);
        }
    }

	
    static void letterNameOption(int[] array, int pitchClass, String letterName){
        Scanner input = new Scanner(System.in);
	
	
//Letter Name Input with Loop
        for (int i = 0; i < array.length; i++){
            do {
                System.out.print("Note Name: ");
                letterName = input.next();

			
//Convert Letter Name
                switch (letterName.toLowerCase()){
			
                    case "c": case "b#": case "dbb":
                        pitchClass = 0;
                        break;
                    case "c#": case "db": case "b##":
                        pitchClass = 1;
                        break;
                    case "d": case "c##": case "ebb":
                        pitchClass = 2;
                        break;
                    case "d#": case "eb": case "fbb":
                        pitchClass = 3;
                        break;
                    case "e": case "fb": case "d##":
                        pitchClass = 4;
                        break;
                    case "f": case "e#": case "gbb":
                        pitchClass = 5;
                        break;
                    case "f#": case "gb": case "e##":
                        pitchClass = 6;
                        break;
                    case "g": case "abb": case "f##":
                        pitchClass = 7;
                        break;
                    case "g#": case "ab":
                        pitchClass = 8;
                        break;
                    case "a": case "g##": case "bbb":
                        pitchClass = 9;
                        break;
                    case "a#": case "bb": case "cbb":
                        pitchClass = 10;
                        break;
                    case "b": case "cb": case "a##":
                        pitchClass = 11;
                        break;
                    default:
                        pitchClass = -1;
                        break;
                }
                array[i] = pitchClass;
                if (pitchClass < 0 || pitchClass > 11)
                    System.out.print("Invalid Input. ");
            } while (pitchClass < 0 || pitchClass > 11);
        }
    }


    static void combinationOption(int[] array, int pitchClass, String combinationName){
        Scanner input = new Scanner(System.in);
	
	
//Pitch-Class/Note Name Input with Loop
        for (int i = 0; i < array.length; i++){
            do {
                System.out.print("Pitch-Class or Note Name: ");
                combinationName = input.next();

			
//Convert String to Pitch-Class
                switch (combinationName.toLowerCase()){
			
                    case "c": case "b#": case "dbb": case "0":
                        pitchClass = 0;
                        break;
                    case "c#": case "db": case "b##": case "1":
                        pitchClass = 1;
                        break;
                    case "d": case "c##": case "ebb": case "2":
                        pitchClass = 2;
                        break;
                    case "d#": case "eb": case "fbb": case "3":
                        pitchClass = 3;
                        break;
                    case "e": case "fb": case "d##": case "4":
                        pitchClass = 4;
                        break;
                    case "f": case "e#": case "gbb": case "5":
                        pitchClass = 5;
                        break;
                    case "f#": case "gb": case "e##": case "6":
                        pitchClass = 6;
                        break;
                    case "g": case "abb": case "f##": case "7":
                        pitchClass = 7;
                        break;
                    case "g#": case "ab": case "8":
                        pitchClass = 8;
                        break;
                    case "a": case "g##": case "bbb": case "9":
                        pitchClass = 9;
                        break;
                    case "a#": case "bb": case "cbb": case "10":
                        pitchClass = 10;
                        break;
                    case "b": case "cb": case "a##": case "11":
                        pitchClass = 11;
                        break;
                    default:
                        pitchClass = -1;
                        break;
                }
                array[i] = pitchClass;
                if (pitchClass < 0 || pitchClass > 11)
                    System.out.print("Invalid Input. ");
            } while (pitchClass < 0 || pitchClass > 11);
        }
    }


    static void ICVectorCalculation(int[] array, int arrayCalculator, int numberNotes,
    int ICVector1, int ICVector2, int ICVector3,
    int ICVector4, int ICVector5, int ICVector6,
    int tSymmetry){
        Scanner input = new Scanner(System.in);


//Interval-Class Calculation with loops	
        for (int i = 0; i < array.length; i++){
            int l = 1;
            while (l < array.length){
                if (i + l == array.length)
                    break;
                arrayCalculator = array[i] - array[i + l];
                l++;

				
//ICVector Calculation	
                switch (arrayCalculator){

                    case 1: case 11: case -1: case -11:
                        ICVector1 = ICVector1 + 1;
                        break;
                    case 2: case 10: case -2: case -10:
                        ICVector2 = ICVector2 + 1;
                        break;
                    case 3: case 9: case -3: case -9:
                        ICVector3 = ICVector3 + 1;
                        break;
                    case 4: case 8: case -4: case -8:
                        ICVector4 = ICVector4 + 1;
                        break;
                    case 5: case 7: case -5: case -7:
                        ICVector5 = ICVector5 + 1;
                        break;
                    case 6: case -6:
                        ICVector6 = ICVector6 + 1;
                        break;
                }
            }
        }
	
	
//Interval Vector Print Out
        System.out.println();
        System.out.println("Interval-Class Vector: "+ ICVector1 + " " + ICVector2 + " " + ICVector3
					+ " " + ICVector4 + " " + ICVector5 + " " + ICVector6);


//Transpositional Symmetry Calculation
        if (ICVector1 == numberNotes)
            tSymmetry = tSymmetry + 2;
        if (ICVector2 == numberNotes)
            tSymmetry = tSymmetry + 2;
        if (ICVector3 == numberNotes)
            tSymmetry = tSymmetry + 2;
        if (ICVector4 == numberNotes)
            tSymmetry = tSymmetry + 2;
        if (ICVector5 == numberNotes)
            tSymmetry = tSymmetry + 2;
        if (ICVector6 >= (numberNotes/2))
            tSymmetry = tSymmetry + 1;

	
//Symmetry Print Out
        System.out.println("Transpositional Symmetry: "+ tSymmetry);
    }

	
    static void IndexVectorCalculation(int[] array, int arrayCalculator, int numberNotes,
    int IndexVector0, int IndexVector1, int IndexVector2,
    int IndexVector3, int IndexVector4, int IndexVector5,
    int IndexVector6, int IndexVector7, int IndexVector8,
    int IndexVector9, int IndexVector10, int IndexVector11,
    int iSymmetry){
        Scanner input = new Scanner(System.in);


//Index Calculation for One Common Tone with Loop
        for (int i = 0; i < array.length; i++){
            arrayCalculator = array[i] + array[i];


//IndexVector Calculation
            switch (arrayCalculator){
				
                case 0: case 12:
                    IndexVector0 = IndexVector0 + 1;
                    break;
                case 1: case 13:
                    IndexVector1 = IndexVector1 + 1;
                    break;
                case 2: case 14:
                    IndexVector2 = IndexVector2 + 1;
                    break;
                case 3: case 15:
                    IndexVector3 = IndexVector3 + 1;
                    break;
                case 4: case 16:
                    IndexVector4 = IndexVector4 + 1;
                    break;
                case 5: case 17:
                    IndexVector5 = IndexVector5 + 1;
                    break;
                case 6: case 18:
                    IndexVector6 = IndexVector6 + 1;
                    break;
                case 7: case 19:
                    IndexVector7 = IndexVector7 + 1;
                    break;
                case 8: case 20:
                    IndexVector8 = IndexVector8 + 1;
                    break;
                case 9: case 21:
                    IndexVector9 = IndexVector9 + 1;
                    break;
                case 10: case 22:
                    IndexVector10 = IndexVector10 + 1;
                    break;
                case 11: case 23:
                    IndexVector11 = IndexVector11 + 1;
                    break;
            }
        }

	
//Index Calculation for Two Common Tones with Loops
        for (int i = 0; i < array.length; i++){
            int l = 1;
            while (l < array.length){
                if (i + l == array.length)
                    break;
                arrayCalculator = array[i] + array[i + l];
                l++;
			
			
//IndexVector Calculation
				switch (arrayCalculator){
				
					case 0: case 12:
						IndexVector0 = IndexVector0 + 2;
						break;
					case 1: case 13: 
						IndexVector1 = IndexVector1 + 2;
						break;
					case 2: case 14:
						IndexVector2 = IndexVector2 + 2;
						break;
					case 3: case 15:
						IndexVector3 = IndexVector3 + 2;
						break;
					case 4: case 16:
						IndexVector4 = IndexVector4 + 2;
						break;
					case 5: case 17:
						IndexVector5 = IndexVector5 + 2;
						break;
					case 6: case 18:
						IndexVector6 = IndexVector6 + 2;
						break;
					case 7: case 19:
						IndexVector7 = IndexVector7 + 2;
						break;
					case 8: case 20:
						IndexVector8 = IndexVector8 + 2;
						break;
					case 9: case 21:
						IndexVector9 = IndexVector9 + 2;
						break;
					case 10: case 22:
						IndexVector10 = IndexVector10 + 2;
						break;
					case 11: case 23:
						IndexVector11 = IndexVector11 + 2;
						break;
				}	
            }
        }
	
	
//IndexVector Print Out	
        System.out.println();
        System.out.println("Index Vector: "+ IndexVector0 + " " + IndexVector1 + " " +
        IndexVector2 + " " + IndexVector3 + " " + IndexVector4 + " " +
        IndexVector5 + " " + IndexVector6 + " " + IndexVector7 + " " +
        IndexVector8 + " " + IndexVector9 + " " + IndexVector10 + " " +
        IndexVector11);


//Inversional Symmetry Calculation
        if (IndexVector0 == numberNotes)
            iSymmetry = iSymmetry + 1;
        if (IndexVector1 == numberNotes)
            iSymmetry = iSymmetry + 1;
        if (IndexVector2 == numberNotes)
            iSymmetry = iSymmetry + 1;
        if (IndexVector3 == numberNotes)
            iSymmetry = iSymmetry + 1;
        if (IndexVector4 == numberNotes)
            iSymmetry = iSymmetry + 1;
        if (IndexVector5 == numberNotes)
            iSymmetry = iSymmetry + 1;
        if (IndexVector6 == numberNotes)
            iSymmetry = iSymmetry + 1;
        if (IndexVector7 == numberNotes)
            iSymmetry = iSymmetry + 1;
        if (IndexVector8 == numberNotes)
            iSymmetry = iSymmetry + 1;
        if (IndexVector9 == numberNotes)
            iSymmetry = iSymmetry + 1;
        if (IndexVector10 == numberNotes)
            iSymmetry = iSymmetry + 1;
        if (IndexVector11 == numberNotes)
            iSymmetry = iSymmetry + 1;
	
	
//Inversional Symmetry Print Out	
        System.out.println("Inversional Symmetry: "+ iSymmetry);

    }
	
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//Variables
        int numberNotes = 0;
        int pitchClass = -1;
        String letterName = "";
        String numberName = "";
        String combinationName = "";
        int arrayCalculator = 0;
        int ICVector1 = 0;
        int ICVector2 = 0;
        int ICVector3 = 0;
        int ICVector4 = 0;
        int ICVector5 = 0;
        int ICVector6 = 0;
        int IndexVector0 = 0;
        int IndexVector1 = 0;
        int IndexVector2 = 0;
        int IndexVector3 = 0;
        int IndexVector4 = 0;
        int IndexVector5 = 0;
        int IndexVector6 = 0;
        int IndexVector7 = 0;
        int IndexVector8 = 0;
        int IndexVector9 = 0;
        int IndexVector10 = 0;
        int IndexVector11 = 0;
        int option = 0;
        int tSymmetry = 1;
        int iSymmetry = 0;


//Number of Notes Input
        do {
            System.out.print("Number of Notes in Set (2-12): ");
            numberNotes = input.nextInt();
            if (numberNotes < 2 || numberNotes > 12)
                System.out.print("Invalid Input. ");
        } while (numberNotes < 2 || numberNotes > 12);
	

//Array Declaration	
        int [] array = new int[numberNotes];


//combinationOption Method Call
        combinationOption(array, pitchClass, combinationName);


//IntervalVectorCalculation Method Call
        ICVectorCalculation(array, arrayCalculator, numberNotes,
        ICVector1, ICVector2, ICVector3,
        ICVector4, ICVector5, ICVector6,
        tSymmetry);


//IndexVectorCalculation Method Call
        IndexVectorCalculation(array, arrayCalculator, numberNotes,
        IndexVector0, IndexVector1, IndexVector2,
        IndexVector3, IndexVector4, IndexVector5,
        IndexVector6, IndexVector7, IndexVector8,
        IndexVector9, IndexVector10, IndexVector11,
        iSymmetry);
        System.out.println();
    }
}
