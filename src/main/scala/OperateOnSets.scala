class OperateOnSets {

  def union(set1: Set[Int], set2: Set[Int]):Set[Int]= {
    val newSet: Set[Int] = set1.++(set2)
    newSet
  }
  def intersection(set1:Set[Int],set2:Set[Int]): Set[Int] ={
    val newSet:Set[Int]=set1.&(set2)
    newSet
  }

}
