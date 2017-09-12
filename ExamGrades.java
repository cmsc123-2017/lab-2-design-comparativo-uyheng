class ExamGrades {
  double grades[];
  
  ExamGrades(double grades[]) {
    this.grades = grades;
  }
  
  // TODO design a function that returns the highest grade
  // -> double
  //method returns the highest grade in the array of grades.
  /*public double highestGrade(){
   * return 0;
   * }
   * public double highestGrade(){
   *   for(int i =0; i < this.grades.length; i++){
   *    ...this.grades[] 
   *   }
   * }
   * */
  public double highestGrade(){
    //return 0; 
    double highest = this.grades[0];
      for(int i =0; i < this.grades.length; i++){
        if(highest < this.grades[i])
          highest = this.grades[i];
      }
    return highest;
  }
  
}