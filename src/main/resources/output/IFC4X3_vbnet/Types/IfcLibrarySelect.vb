' SELECT TYPE IfcLibrarySelect
' Options:
' - IfcLibraryInformation
' - IfcLibraryReference
Public Class IfcLibrarySelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcLibraryInformation OrElse TypeOf value Is IfcLibraryReference) Then
            Throw New ArgumentException("Value must be one of: IfcLibraryInformation, IfcLibraryReference")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
