public class DNA {
  //this ia a program to sequence DNA
  public static void main(String[] args) {
    
    // -. .-.  .-.  .-.  .
    //   \   \ /  \    \ /
    //   / \  \  /  \   \
    //  ~   `-~`-`   `-~ `-
    String dna1 = "ATGCATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";

    String dna = dna1;
    System.out.println(dna.length());
    int startCodon = dna.indexOf("ATG");
    System.out.println(startCodon);
    int stopCodon = dna.indexOf("TGA");
     System.out.println(stopCodon);

    if (startCodon != -1 && stopCodon != -1 && ((stopCodon - startCodon) % 3 == 0)) {
    
      System.out.println("There's a protein present");
      String protein = dna.substring(3, dna.length() - 3);
      System.out.println("Protein: " + protein);
    }
      else { 
       System.out.println("No protein present.");
    }
  }
  }
