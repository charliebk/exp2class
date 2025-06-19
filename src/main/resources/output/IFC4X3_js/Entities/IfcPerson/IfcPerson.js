class IfcPerson {
    constructor() {
        /** @type {IFCIDENTIFIER} */
        this.Identification = null;
        /** @type {IFCLABEL} */
        this.FamilyName = null;
        /** @type {IFCLABEL} */
        this.GivenName = null;
        /** @type {IFCLABEL[]} */
        this.MiddleNames = null;
        /** @type {IFCLABEL[]} */
        this.PrefixTitles = null;
        /** @type {IFCLABEL[]} */
        this.SuffixTitles = null;
        /** @type {IFCACTORROLE[]} */
        this.Roles = null;
        /** @type {IFCADDRESS[]} */
        this.Addresses = null;
    }

    // === INVERSE CLAUSES ===
    // EngagedIn : SET [0:?] OF IfcPersonAndOrganization FOR ThePerson

    // === WHERE CLAUSES ===
    // IdentifiablePerson : EXISTS(Identification) OR EXISTS(FamilyName) OR EXISTS(GivenName)
    // ValidSetOfNames : NOT EXISTS(MiddleNames) OR EXISTS(FamilyName) OR EXISTS(GivenName)
}
