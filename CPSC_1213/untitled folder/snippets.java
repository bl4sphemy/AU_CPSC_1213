      ECS-

      if (labelIn != "") {
         for (Dodecahedron d: array) { 
            String tempLabel = d.getLabel().toUpperCase();
            System.out.println(labelIn.toUpperCase());
            if (labelIn.toUpperCase() == tempLabel) {
               System.out.print(d);
               //return d;
            }
            //else {
               //System.out.println(d.getLabel());
               //System.out.println("\"" + labelIn + p"\" not found");
            //}
         }
      }
      return null;









         if(d.getLabel().equals(labelIn)) { 
            System.out.println(d + "\n");
            //return d; 
             
         }
         else { 
            System.out.println("\""+ labelIn + "\" not found");
            //return null;
         }



         //While loop

         while (index < array.size()) {
         
         if (array.get(index).getLabel().toUpperCase() == labelIn.toUpperCase()){
            System.out.println(array.get(index));
         }
         index++;
      
      }
