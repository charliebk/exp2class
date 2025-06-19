public class IfcConversionBasedUnit : IfcNamedUnit
{
    public IfcLabel Name { get; set; }
    public IfcMeasureWithUnit ConversionFactor { get; set; }

    // === EXTENDED BY ===
    // IfcConversionBasedUnitWithOffset

    // === INVERSE CLAUSES ===
    // HasExternalReference : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
}
