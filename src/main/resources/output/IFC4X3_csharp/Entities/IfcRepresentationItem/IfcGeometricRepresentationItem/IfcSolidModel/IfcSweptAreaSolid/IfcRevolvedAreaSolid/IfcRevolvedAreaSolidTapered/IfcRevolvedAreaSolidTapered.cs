public class IfcRevolvedAreaSolidTapered : IfcRevolvedAreaSolid
{
    public IfcProfileDef EndSweptArea { get; set; }

    // === WHERE CLAUSES ===
    // CorrectProfileAssignment : IfcTaperedSweptAreaProfiles(SELF\IfcSweptAreaSolid.SweptArea, SELF.EndSweptArea)
}
