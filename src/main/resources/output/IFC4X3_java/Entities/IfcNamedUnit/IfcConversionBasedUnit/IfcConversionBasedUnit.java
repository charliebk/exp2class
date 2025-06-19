public class IfcConversionBasedUnit extends IfcNamedUnit {
    public IfcLabel Name;
    public IfcMeasureWithUnit ConversionFactor;

    // === EXTENDED BY ===
    // IfcConversionBasedUnitWithOffset

    // === INVERSE CLAUSES ===
    // HasExternalReference : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
}
