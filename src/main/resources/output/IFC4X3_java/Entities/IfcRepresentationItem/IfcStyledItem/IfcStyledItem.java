public class IfcStyledItem extends IfcRepresentationItem {
    public IfcRepresentationItem Item;
    public SET [1:?] OF IfcPresentationStyle Styles;
    public IfcLabel Name;

    // === WHERE CLAUSES ===
    // ApplicableItem : NOT('IFC4X3_DEV_73740fe4.IFCSTYLEDITEM' IN TYPEOF(Item))
}
