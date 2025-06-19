public class IfcExtrudedAreaSolidTapered : IfcExtrudedAreaSolid
{
    public IfcProfileDef EndSweptArea { get; set; }

    // === WHERE CLAUSES ===
    // CorrectProfileAssignment : IfcTaperedSweptAreaProfiles(SELF\IfcSweptAreaSolid.SweptArea, SELF.EndSweptArea)
}
