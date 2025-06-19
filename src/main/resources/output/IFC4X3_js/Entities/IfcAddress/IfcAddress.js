class IfcAddress {
    constructor() {
        /** @type {IFCADDRESSTYPEENUM} */
        this.Purpose = null;
        /** @type {IFCTEXT} */
        this.Description = null;
        /** @type {IFCLABEL} */
        this.UserDefinedPurpose = null;
    }

    // === EXTENDED BY ===
    // IfcPostalAddress
    // IfcTelecomAddress

    // === INVERSE CLAUSES ===
    // OfPerson : SET [0:?] OF IfcPerson FOR Addresses
    // OfOrganization : SET [0:?] OF IfcOrganization FOR Addresses

    // === WHERE CLAUSES ===
    // WR1 : (NOT(EXISTS(Purpose))) OR ((Purpose <> IfcAddressTypeEnum.USERDEFINED) OR ((Purpose = IfcAddressTypeEnum.USERDEFINED) AND EXISTS(SELF.UserDefinedPurpose)))
}
