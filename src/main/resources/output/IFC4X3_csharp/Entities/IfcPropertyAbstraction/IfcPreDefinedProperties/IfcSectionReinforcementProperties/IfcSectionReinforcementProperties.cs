public class IfcSectionReinforcementProperties : IfcPreDefinedProperties
{
    public IfcLengthMeasure LongitudinalStartPosition { get; set; }
    public IfcLengthMeasure LongitudinalEndPosition { get; set; }
    public IfcLengthMeasure TransversePosition { get; set; }
    public IfcReinforcingBarRoleEnum ReinforcementRole { get; set; }
    public IfcSectionProperties SectionDefinition { get; set; }
    public SET [1:?] OF IfcReinforcementBarProperties CrossSectionReinforcementDefinitions { get; set; }
}
