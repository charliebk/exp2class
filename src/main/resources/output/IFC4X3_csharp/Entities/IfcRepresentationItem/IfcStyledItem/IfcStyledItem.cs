public class IfcStyledItem : IfcRepresentationItem
{
    public IfcRepresentationItem Item { get; set; }
    public SET [1:?] OF IfcPresentationStyle Styles { get; set; }
    public IfcLabel Name { get; set; }

    // === WHERE CLAUSES ===
    // ApplicableItem : NOT('IFC4X3_DEV_73740fe4.IFCSTYLEDITEM' IN TYPEOF(Item))
}
