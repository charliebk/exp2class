public class IfcRelConnectsElements : IfcRelConnects
{
    public IfcConnectionGeometry ConnectionGeometry { get; set; }
    public IfcElement RelatingElement { get; set; }
    public IfcElement RelatedElement { get; set; }

    // === EXTENDED BY ===
    // IfcRelConnectsPathElements
    // IfcRelConnectsWithRealizingElements

    // === WHERE CLAUSES ===
    // NoSelfReference : RelatingElement :<>: RelatedElement
}
