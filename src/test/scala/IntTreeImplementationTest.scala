import IntTreeImplementation.EmptyTree
import org.scalatest.flatspec.AnyFlatSpec

class IntTreeImplementationTest extends AnyFlatSpec{

  val itl: IntTreeImplementation.type = IntTreeImplementation
  val tree: IntTreeImplementation.Node = itl.Node(3,itl.Node(2,itl.Node(1,EmptyTree,EmptyTree),itl.EmptyTree)
    ,itl.Node(5,itl.EmptyTree,itl.Node(9,itl.EmptyTree,itl.EmptyTree)))
  "This Tree" should "contain element 1" in {
    assert(itl.contains(tree,1))
  }
  "This Tree" should "does not contain element 6" in {
    assert(!itl.contains(tree,6))
  }

  "This Tree" should "insert node" in {
    val node=itl.Node(2,IntTreeImplementation.Node(10,itl.Node(4,itl.EmptyTree,itl.EmptyTree),itl.EmptyTree),itl.EmptyTree)
    assert(itl.contains(node, 2))
  }
}
