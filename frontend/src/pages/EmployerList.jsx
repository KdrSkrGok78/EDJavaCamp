import React, { useState, useEffect } from 'react'
import { Icon, Label, Menu, Table } from 'semantic-ui-react'
import EmployerService from '../services/employerService'

export default function EmployerList() {

  const [employers, setEmployer] = useState([])

  useEffect(() => {
    let employerService = new EmployerService()
    employerService.getEmployer().then(result => setEmployer(result.data.data))
  })
  return (
    <div>

      <Table celled>
        <Table.Header>
          <Table.Row>
            <Table.HeaderCell>Company Names</Table.HeaderCell>
            <Table.HeaderCell>Phone Number</Table.HeaderCell>

          </Table.Row>
        </Table.Header>

        <Table.Body>
          {employers.map(employer => (
            <Table.Row>
              <Table.Cell>
                {employer.companyName}

              </Table.Cell>
              <Table.Cell>
                {employer.phoneNumber}
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
