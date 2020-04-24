import java.util.Random;

//Método que crea una matriz de filasxcolumnas con números generados aletóriamente.
int[][] generateRandomMatrix(int filas, int columnas) {
   int[][] matrix = new int[filas][columnas]; 
   
   for(var i = 0; i < matrix.length; i ++) {
      for(var j = 0; j < matrix[i].length; j ++) {
         matrix[i][j] = random.nextInt(21);
      }
   }
   return matrix;
}

//Agregar su código
