import React, { useState , useEffect} from 'react'
import { Icon, Label, Menu, Table } from 'semantic-ui-react'
import CvService from '../services/cvService'

export default function CvList() {

 const [cvs, setCv] = useState([])
 useEffect(() => {
   let cvService = new CvService()
   cvService.getCv().then(result => setCv(result.data.data) )
 })
  

    return (    
        <div>
            <Table celled>
        <Table.Header>
          <Table.Row>
            <Table.HeaderCell>First Name</Table.HeaderCell>
            <Table.HeaderCell>Last Name</Table.HeaderCell>
            <Table.HeaderCell>Language</Table.HeaderCell>
            <Table.HeaderCell>Programme Language</Table.HeaderCell>


          </Table.Row>
        </Table.Header>

        <Table.Body>
          {cvs.map(cv => (
            <Table.Row>
              <Table.Cell>
              {cv.candidate.firstName}
              </Table.Cell>
              <Table.Cell>
              {cv.candidate.lastName}
              </Table.Cell>
              <Table.Cell>
              {cv.foreignLanguage.language}
              </Table.Cell>
              <Table.Cell>
              {cv.programmeLanguage.programmeLanguage}
              </Table.Cell>
            </Table.Row>
          ))}

        </Table.Body>

        <Table.Footer>
          <Table.Row>
            <Table.HeaderCell colSpan='3'>
              <Menu floated='right' pagination>
                <Menu.Item as='a' icon>
                  <Icon name='chevron left' />
                </Menu.Item>
                <Menu.Item as='a'>1</Menu.Item>
                <Menu.Item as='a'>2</Menu.Item>
                <Menu.Item as='a'>3</Menu.Item>
                <Menu.Item as='a'>4</Menu.Item>
                <Menu.Item as='a' icon>
                  <Icon name='chevron right' />
                </Menu.Item>
              </Menu>
            </Table.HeaderCell>
          </Table.Row>
        </Table.Footer>
      </Table>
        </div>
    )
}
