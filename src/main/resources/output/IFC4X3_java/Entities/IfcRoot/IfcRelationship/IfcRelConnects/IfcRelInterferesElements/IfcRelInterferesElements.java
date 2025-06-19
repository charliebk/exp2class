public class IfcRelInterferesElements extends IfcRelConnects {
    public IfcInterferenceSelect RelatingElement;
    public IfcInterferenceSelect RelatedElement;
    public IfcConnectionGeometry InterferenceGeometry;
    public IfcIdentifier InterferenceType;
    public IfcLogical ImpliedOrder;
    public IfcSpatialZone InterferenceSpace;

    // === WHERE CLAUSES ===
    // NoSelfReference : RelatingElement :<>: RelatedElement
}
