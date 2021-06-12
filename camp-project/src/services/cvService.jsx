import axios from 'axios'

export default class CvService{
    getEmployer(){
        return axios.get("http://localhost:8080/api/cvs/getAll")
    }
}