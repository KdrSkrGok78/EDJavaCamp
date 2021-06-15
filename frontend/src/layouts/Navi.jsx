import React from 'react'
import { Button, Container,Icon ,Dropdown, Menu } from 'semantic-ui-react'

export default function Navi() {
    return (
        <div>
            <Menu inverted fixed>
                <Container>
                    <Button icon secondary fixed>
                        <Icon name='world' />
                    </Button>
                    <Menu.Item

                        name='Hrms Project'

                    />
                    <Menu.Item>

                        <Button primary>My Profile</Button>
                    </Menu.Item>
                    <Menu.Item>
                        <Button primary>My Cvs</Button>
                    </Menu.Item>




                    <Menu.Menu position='right'>
                        <Menu.Item>
                            <Button.Group>
                                <Button>Register</Button>
                                <Button.Or />
                                <Button positive>Login</Button>
                            </Button.Group>
                        </Menu.Item>
                    </Menu.Menu>
                </Container>

            </Menu>
        </div>
    )
}
