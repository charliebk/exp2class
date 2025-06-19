public class IfcRelConnectsElements extends IfcRelConnects {
    public IfcConnectionGeometry ConnectionGeometry;
    public IfcElement RelatingElement;
    public IfcElement RelatedElement;

    // === EXTENDED BY ===
    // IfcRelConnectsPathElements
    // IfcRelConnectsWithRealizingElements

    // === WHERE CLAUSES ===
    // NoSelfReference : RelatingElement :<>: RelatedElement
}
