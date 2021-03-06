public static Integer last_element = NULL;
boolean checkBST(Node root) {
  if(root == null){
    return true;
   }
   
   if(!checkBST(root.left)){
    return false;
   }
   
   if(last_element != null && root.data <= last_element){
    return false;
   }
   
   last_element = root.data;
   
   if(!checkBST(root.right)){
    return false;
   }
   
   return true;
    

}
