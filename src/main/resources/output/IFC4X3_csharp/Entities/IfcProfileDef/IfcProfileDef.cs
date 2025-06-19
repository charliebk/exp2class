public class IfcProfileDef
{
    public IfcProfileTypeEnum ProfileType { get; set; }
    public IfcLabel ProfileName { get; set; }

    // === EXTENDED BY ===
    // IfcArbitraryClosedProfileDef
    // IfcArbitraryOpenProfileDef
    // IfcCompositeProfileDef
    // IfcDerivedProfileDef
    // IfcOpenCrossProfileDef
    // IfcParameterizedProfileDef

    // === INVERSE CLAUSES ===
    // HasExternalReference : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
    // HasProperties : SET [0:?] OF IfcProfileProperties FOR ProfileDefinition
}
