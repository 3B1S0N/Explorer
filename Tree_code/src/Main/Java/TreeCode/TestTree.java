package TreeCode;


/**
 * A method to test the Tree class
 **/
class TestTree {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Tree<String> ashesiOrgChart = new Tree<String>("President");
        Tree<String> dos = new Tree<String>("Dean of Students");
        Tree<String> provost = new Tree<String>("Provost");
        Tree<String> hcs = new Tree<String>("Head of CS Dept");
        Tree<String> hba = new Tree<String>("Head of BA Dept");
        Tree<String> has = new Tree<String>("Head of A&S Dept");
        Tree<String> doe = new Tree<String>("Dean of Engineering");
        Tree<String> coo = new Tree<String>("Chief Operating Officer");
        Tree<String> fam = new Tree<String>("Facilities Manager");
        Tree<String> fim = new Tree<String>("Finance Manager");
        Tree<String> itm = new Tree<String>("IT Manager");
        Tree<String> ados = new Tree<String>("Associate Dean of Students");
        Tree<String> coun = new Tree<String>("Counselor");
        Tree<String> ito1 = new Tree<String>("IT Officer");
        Tree<String> ito2 = new Tree<String>("IT Officer");

        ashesiOrgChart.setSubTrees(provost, coo, dos);
        coo.setSubTrees(fam, fim, itm);
        provost.setSubTrees(hcs, hba, has, doe);
        dos.setSubTrees(ados, coun);
        itm.setSubTrees(ito1, ito2);

        System.out.println("Here's an organizational chart:");
        System.out.println("It has " + ashesiOrgChart.countNodes() + " nodes,");
        System.out.println("of which " + ashesiOrgChart.countLeaves() + " are leaves.");
        ashesiOrgChart.drawTree();
        System.out.println();
        System.out.println("Here is the order of nodes visited in a pre-order traversal:");
        ashesiOrgChart.printPreOrderTraversal();
    }
}