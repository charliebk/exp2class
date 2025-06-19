public class IfcStructuralActivity : IfcProduct
{
    public IfcStructuralLoad AppliedLoad { get; set; }
    public IfcGlobalOrLocalEnum GlobalOrLocal { get; set; }

    // === EXTENDED BY ===
    // IfcStructuralAction
    // IfcStructuralReaction

    // === INVERSE CLAUSES ===
    // AssignedToStructuralItem : SET [0:1] OF IfcRelConnectsStructuralActivity FOR RelatedStructuralActivity
}
