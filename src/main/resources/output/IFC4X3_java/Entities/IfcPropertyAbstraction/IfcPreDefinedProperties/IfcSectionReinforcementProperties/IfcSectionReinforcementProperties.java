public class IfcSectionReinforcementProperties extends IfcPreDefinedProperties {
    public IfcLengthMeasure LongitudinalStartPosition;
    public IfcLengthMeasure LongitudinalEndPosition;
    public IfcLengthMeasure TransversePosition;
    public IfcReinforcingBarRoleEnum ReinforcementRole;
    public IfcSectionProperties SectionDefinition;
    public SET [1:?] OF IfcReinforcementBarProperties CrossSectionReinforcementDefinitions;
}
