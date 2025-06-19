public class IfcStructuralActivity extends IfcProduct {
    public IfcStructuralLoad AppliedLoad;
    public IfcGlobalOrLocalEnum GlobalOrLocal;

    // === EXTENDED BY ===
    // IfcStructuralAction
    // IfcStructuralReaction

    // === INVERSE CLAUSES ===
    // AssignedToStructuralItem : SET [0:1] OF IfcRelConnectsStructuralActivity FOR RelatedStructuralActivity
}
