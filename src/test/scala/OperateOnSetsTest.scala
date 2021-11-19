import org.scalatest.flatspec.AnyFlatSpec

class OperateOnSetsTest extends AnyFlatSpec{
val ost=new OperateOnSets
"Union of Sets" should " be valid and ()" in {
  val set1: Set[Int] = Set()
  val set2: Set[Int] = Set()
  val newSet = Set()
  assert {
    newSet == ost.union(set1, set2)
  }
}

  "Union of Sets" should " be valid and (1,2,3,4)" in {
    val set1: Set[Int] = Set(1, 2)
    val set2: Set[Int] = Set(3, 4)
    val newSet = Set(1, 2, 3, 4)
    assert {
      newSet == ost.union(set1, set2)
    }
  }

    "Intersection of Sets" should " be valid and (1,2)" in {
      val set1: Set[Int] = Set(1, 2)
      val set2: Set[Int] = Set(1, 2, 3, 4)
      val newSet = Set(1, 2)
      assert {
        newSet == ost.intersection(set1, set2)
      }
    }
      "Intersection of Sets" should " be valid and ()" in {
        val set1: Set[Int] = Set()
        val set2: Set[Int] = Set()
        val newSet = Set()
        assert {
          newSet == ost.intersection(set1, set2)
        }
      }
    }

